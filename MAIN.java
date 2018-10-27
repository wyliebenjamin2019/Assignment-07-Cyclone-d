public class Main {

    public static void main(String[] args) {

        double x1 = Math.toRadians(15);
        double x2 = Math.toRadians(20);
        double y1 = Math.toRadians(25);
        double y2 = Math.toRadians(23);

        double a = Math.pow(Math.sin((x2-x1)/2),2)+Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin((y2-y1)/2),2);
        double c = 2*Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        double dist = 6371* c;
        System.out.println(dist);

        double xa1 = Math.toRadians(15);
        double ya1 = Math.toRadians(25);
        double xb1 = Math.toRadians(20);
        double yb1 = Math.toRadians(23);

        double xa2 = Math.toRadians(20);
        double ya2 = Math.toRadians(23);
        double xb2 = Math.toRadians(24);
        double yb2 = Math.toRadians(21);

        double xa3 = Math.toRadians(24);
        double ya3 = Math.toRadians(21);
        double xb3 = Math.toRadians(27);
        double yb3 = Math.toRadians(20);

        double xa4 = Math.toRadians(27);
        double ya4 = Math.toRadians(20);
        double xb4 = Math.toRadians(35);
        double yb4 = Math.toRadians(19);

        double xa5 = Math.toRadians(35);
        double ya5 = Math.toRadians(19);
        double xb5 = Math.toRadians(46);
        double yb5 = Math.toRadians(21);

        double xa6 = Math.toRadians(46);
        double ya6 = Math.toRadians(21);
        double xb6 = Math.toRadians(56);
        double yb6 = Math.toRadians(23);

        double xa7 = Math.toRadians(56);
        double ya7 = Math.toRadians(23);
        double xb7 = Math.toRadians(65);
        double yb7 = Math.toRadians(25);

        double xa8 = Math.toRadians(65);
        double ya8 = Math.toRadians(25);
        double xb8 = Math.toRadians(70);
        double yb8 = Math.toRadians(28);

        double xa9 = Math.toRadians(70);
        double ya9 = Math.toRadians(28);
        double xb9 = Math.toRadians(73);
        double yb9 = Math.toRadians(32);

        double xa10 = Math.toRadians(73);
        double ya10 = Math.toRadians(32);
        double xb10 = Math.toRadians(74);
        double yb10 = Math.toRadians(34);

        double xa11 = Math.toRadians(74);
        double ya11 = Math.toRadians(34);
        double xb11 = Math.toRadians(74);
        double yb11 = Math.toRadians(36);

        double xa12 = Math.toRadians(74);
        double ya12 = Math.toRadians(36);
        double xb12 = Math.toRadians(74);
        double yb12 = Math.toRadians(39);

        double disx1 = xa1-xb1;
        double disy1 = ya1-yb1;
        double a1 = (Math.sin(disx1/2)*Math.sin(disx1/2))+(Math.cos(xa1)*Math.cos(xb1)*Math.sin(disy1/2)*Math.sin(disy1/2));
        double c1 = 2*Math.asin(Math.sqrt(a1));
        double distance1 = 6371*c1;

        double disx2 = xa2-xb2;
        double disy2 = ya2-yb2;
        double a2 = (Math.sin(disx2/2)*Math.sin(disx2/2))+(Math.cos(xa2)*Math.cos(xb2)*Math.sin(disy2/2)*Math.sin(disy2/2));
        double c2 = 2*Math.asin(Math.sqrt(a2));
        double distance2 = 6371*c2;

        double disx3 = xa3-xb3;
        double disy3 = ya3-yb3;
        double a3 = (Math.sin(disx3/2)*Math.sin(disx3/2))+(Math.cos(xa3)*Math.cos(xb3)*Math.sin(disy3/2)*Math.sin(disy3/2));
        double c3 = 2*Math.asin(Math.sqrt(a3));
        double distance3 = 6371*c3;

        double disx4 = xa4-xb4;
        double disy4 = ya4-yb4;
        double a4 = (Math.sin(disx4/2)*Math.sin(disx4/2))+(Math.cos(xa4)*Math.cos(xb4)*Math.sin(disy4/2)*Math.sin(disy4/2));
        double c4 = 2*Math.asin(Math.sqrt(a4));
        double distance4 = 6371*c4;

        double disx5 = xa5-xb5;
        double disy5 = ya5-yb5;
        double a5 = (Math.sin(disx5/2)*Math.sin(disx5/2))+(Math.cos(xa5)*Math.cos(xb5)*Math.sin(disy5/2)*Math.sin(disy5/2));
        double c5 = 2*Math.asin(Math.sqrt(a5));
        double distance5 = 6371*c5;

        double disx6= xa6-xb6;
        double disy6 = ya6-yb6;
        double a6 = (Math.sin(disx6/2)*Math.sin(disx6/2))+(Math.cos(xa6)*Math.cos(xb6)*Math.sin(disy6/2)*Math.sin(disy6/2));
        double c6 = 2*Math.asin(Math.sqrt(a6));
        double distance6 = 6371*c6;

        double disx7 = xa7-xb7;
        double disy7 = ya1-yb7;
        double a7 = (Math.sin(disx7/2)*Math.sin(disx7/2))+(Math.cos(xa7)*Math.cos(xb7)*Math.sin(disy7/2)*Math.sin(disy7/2));
        double c7 = 2*Math.asin(Math.sqrt(a));
        double distance7 = 6371*c7;

        double disx8 = xa8-xb8;
        double disy8 = ya8-yb8;
        double a8 = (Math.sin(disx8/2)*Math.sin(disx8/2))+(Math.cos(xa8)*Math.cos(xb8)*Math.sin(disy8/2)*Math.sin(disy8/2));
        double c8 = 2*Math.asin(Math.sqrt(a8));
        double distance8 = 6371*c8;

        double disx9 = xa9-xb9;
        double disy9 = ya9-yb9;
        double a9 = (Math.sin(disx9/2)*Math.sin(disx9/2))+(Math.cos(xa9)*Math.cos(xb9)*Math.sin(disy9/2)*Math.sin(disy9/2));
        double c9 = 2*Math.asin(Math.sqrt(a9));
        double distance9 = 6371*c9;

        double disx10 = xa10-xb10;
        double disy10 = ya10-yb10;
        double a10 = (Math.sin(disx10/2)*Math.sin(disx10/2))+(Math.cos(xa10)*Math.cos(xb10)*Math.sin(disy10/2)*Math.sin(disy10/2));
        double c10 = 2*Math.asin(Math.sqrt(a10));
        double distance10 = 6371*c10;

        double disx11 = xa11-xb11;
        double disy11 = ya1-yb11;
        double a11 = (Math.sin(disx11/2)*Math.sin(disx11/2))+(Math.cos(xa11)*Math.cos(xb11)*Math.sin(disy11/2)*Math.sin(disy11/2));
        double c11 = 2*Math.asin(Math.sqrt(a11));
        double distance11 = 6371*c11;

        double disx12 = xa12-xb12;
        double disy12 = ya12-yb12;
        double a12 = (Math.sin(disx12/2)*Math.sin(disx12/2))+(Math.cos(xa12)*Math.cos(xb12)*Math.sin(disy12/2)*Math.sin(disy12/2));
        double c12 = 2*Math.asin(Math.sqrt(a12));
        double distance12 = 6371*c12;

        System.out.println("Day 1 Distance: 0");
        System.out.println("Day 2 Distance:"+distance1);
        System.out.println("Day 3 Distance:"+distance2);
        System.out.println("Day 4 Distance:"+distance3);
        System.out.println("Day 5 Distance:"+distance4);
        System.out.println("Day 6 Distance:"+distance5);
        System.out.println("Day 7 Distance:"+distance6);
        System.out.println("Day 8 Distance:"+distance7);
        System.out.println("Day 9 Distance:"+distance8);
        System.out.println("Day 10 Distance:"+distance9);
        System.out.println("Day 11 Distance:"+distance10);
        System.out.println("Day 12 Distance:"+distance11);
        System.out.println("Day 13 Distance:"+distance12);


        double totdis = distance1+distance2+distance3+distance4+distance5+distance6+distance7+distance8+distance9+distance10+distance11+distance12;


        System.out.print("The distance the Hurricane travelled is, "+totdis+" Kilometers");
    }
}
