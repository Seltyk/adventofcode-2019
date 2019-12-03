#!/bin/lua
file = assert(io.open("inputs/1.txt", 'r')) --open the file
totalFuel = 0

---calculates required fuel for a module of given mass, adds to `totalFuel`
---@param mass number the mass of the module
---@param tyranny boolean put a truthy value if you want tyranny
function addFuel(mass, tyranny)
	mass = mass//3 - 2 --mass to fuel required
	if mass <= 0 then return end --no point accounting for negligable mass
	totalFuel = totalFuel + mass --add fuel after calculation
	if tyranny then return addFuel(mass, true) end --recurse for tyranny
end

local mass = file:read("*number")
while(mass) do
	addFuel(mass, false)
	mass = file:read("*number")
end

print(totalFuel)
