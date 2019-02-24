# Scenic Trips

Scenic Trips is a sort-of proof-of-concept/side-project of a route-finder, which adds "scenic" destinations to a route. A user will select a start and end point, as well as a "maximum detour time." This will be used to find a route from the start to the finish, which passes through a number of "scenic" destinations, so that the route taken is no more than the "maximum detour time" plus the shortest path distance between the start and finish.

Currently, the goal is to create an algorithm which does the above on the provided road network graph. The algorithm should take a reasonable amount of space and time relative to the graph (which grows slowly), so that it would at least theoretically scale to larger graphs. This algorithm will then be exposed as a web service.
