## Phase 1
I created a HashMap with five species and added a search feature.
A HashMap fits this task because each species name connects directly
to its count. An array or ArrayList would require searching for the name.

## Phase 2
I added file reading. When a species appeared for the first time,
I added it with a count of 1. For later sightings, I increased its count.
The file must be in the program's working directory so Scanner can find it.

## Phase 3
I looped through the map to find the highest and lowest counts.
Finding both takes O(n) time because every species must be checked.
Looking up one species by name takes O(1) time on average.

## Phase 4
The AI review pointed out empty files, missing files, blank lines,
and capitalization differences. The code checks for an empty map,
handles missing files, and skips blank lines. Searches remain
case-sensitive, so names must match the file.
