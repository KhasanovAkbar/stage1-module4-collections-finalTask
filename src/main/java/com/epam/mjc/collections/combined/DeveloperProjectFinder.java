package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        return projects.entrySet().stream()
                .filter(entry -> entry.getValue().contains(developer))
                .sorted((project1, project2) -> {
                    int lengthComparison = Integer.compare(project2.getKey().length(), project1.getKey().length());
                    return lengthComparison != 0 ? lengthComparison : project2.getKey().compareTo(project1.getKey());
                })
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }
}
