package Day27;

import java.util.*;

public class _02_MapRecap {
    public static void main(String[] args) {

        // hard question


        // PART 1
        // create a map with groupName as key and groupMembers as value
        // "Group1" = ["Member1", "Member2"]
        // "Group2" = ["Member3", "Member4", "Member5"]

        // PART 2
        // find how many members each group has


        Map<String, ArrayList<String>> groupsAndMembers = new HashMap<>();

        ArrayList<String> testers = new ArrayList<>();
        Collections.addAll(testers, "member1", "member2");

        ArrayList<String> dev = new ArrayList<>();
        Collections.addAll(dev, "member3", "member4", "member5");

        groupsAndMembers.put("group1", testers);
        groupsAndMembers.put("group2", dev);

        System.out.println(groupsAndMembers);

        System.out.println(groupsAndMembers.keySet());

        for (String elements: groupsAndMembers.keySet())
            System.out.println(elements + elements.length());
















    }
}
