package org.benf.cfr.tests.thirdparty;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 14/03/2013
 * Time: 15:15
 */
public class Usa {
    public String name = "Detroit";

    public class England {
        public String name = "London";

        public class Ireland {
            public String name = "Dublin";

            public void print_names() {
                System.out.println(name);
            }
        }
    }
}