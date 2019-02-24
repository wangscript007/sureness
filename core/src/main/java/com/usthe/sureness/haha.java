package com.usthe.sureness;

import com.usthe.sureness.util.TireTreePathMatcher;


import java.util.HashSet;
import java.util.Set;

/* *
 * @Author tomsun28
 * @Description
 * @Date 22:49 2019-01-09
 */
public class haha {


    public static void main(String[] args) {
        TireTreePathMatcher pathTireTree = TireTreePathMatcher.getInstance();
        Set<String> paths = new HashSet<String>();
        paths.add("/api/v2/host===post===jwt[role2,role3,role4]");
        paths.add("/api/v2/host===get===jwt[role2,role3,role4]");
        paths.add("/api/v2/host===delete===jwt[role2,role3,role4]");
        paths.add("/api/v2/host===put===jwt[role2,role3,role4]");
        paths.add("/api/v1/host===put===jwt[role2,role3,role4]");
        paths.add("/api/v3/host===put===jwt[role2,role3,role4]");
        paths.add("/api/v2/detail===put===jwt[role2,role3,role4]");
        paths.add("/api/v2/mom===put===jwt[role2,role3,role4]");
        paths.add("/api/*/mom/ha===put===jwt[role2,role3,role4]");
        paths.add("/api/mi/**===put===jwt[role2,role3,role4]");
        pathTireTree.reBuildTree(paths);
        String filterRole = pathTireTree.searchPathFilterRoles("/api/v2/host===get");
        String ff1 = pathTireTree.searchPathFilterRoles("/api/v1/mom===put");
        String ff2 = pathTireTree.searchPathFilterRoles("/api/v2/host===put");
        String ff3 = pathTireTree.searchPathFilterRoles("/api/v2/details===put");
        String ff4 = pathTireTree.searchPathFilterRoles("/api/v2/detail===put");
        String ff5 = pathTireTree.searchPathFilterRoles("/api/dd/mom/ha===put");
        String ff6 = pathTireTree.searchPathFilterRoles("/api/mi/mom/ha===put");

    }
}
