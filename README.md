# simulation
Created according to the technical specifications presented  https://www.youtube.com/watch?v=Pzydm8GZzMs 

Overview
The point of the project is a step-by-step simulation of a 2D world populated by herbivores and predators. In addition to creatures, the world contains resources (grass), which the herbivores feed on, and static objects with which you can't interact - they just fill the space.

<img width="206" alt="Screenshot 2023-11-17 at 21 13 02" src="https://github.com/symbatDeveloper/simulation/assets/136576925/dfd22b52-8cef-488b-bc5d-a7101f304405">

<img width="206" alt="Screenshot 2023-11-17 at 21 13 02" src="https://github.com/symbatDeveloper/simulation/assets/136576925/074c1720-9e78-40d6-ac56-f71b5af7edbe">

Implemented features:
Creature actions:
Herbivores can either go towards the Grass or eat it
Predators can either go towards the Herbivores or eat them
Breadth-first search used as pathfinding algorithm
algorithm excludes stationary (Tree & Rock) objects from pathfinding
Renderer displays the current state of the simulation in the console output
