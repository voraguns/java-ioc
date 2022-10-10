import org.springframework.context.support.GenericApplicationContext;

class Start {
    public static void main(String[] data) {
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        context.registerBean("captain", Player.class);
        context.registerBean( "goal-keeper", Player.class);
        context.registerBean(Team.class);
        context.refresh();
        
        Player p = context.getBean("captain", Player.class);
        p.name = "David Beckham";
        p.number = 7;
        p.salary = 47000;
        
        Player q = context.getBean("captain", Player.class);
        System.out.println(q.name);
        
        String[] list = context.getBeanDefinitionNames();
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}

class Player {
    String name;
    int number;
    double salary;
}

class Team {
    String name;
    double score;
}

// The keyword "new" can be viwed in two ways
// 1. use for allocating memory, in C is malloc()
// 2. use for creating an instance 



// instance is "for example"
// instance noodle, instance coffee