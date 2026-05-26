void main() {

    Scanner in = new Scanner(System.in);
    double d = 42.165;
    IO.println("Enter the distances covered by racers in Marathon (Kilometers) please");
    IO.println("(press q to terminate):");
    List<Double> list = new ArrayList<>();
    String option = "";
    while (true) {
        option = in.nextLine();
        if (option.charAt(0) == 'q') break;
        double km = Double.parseDouble(option);
        list.add(km);

    }
    //System.out.println(list);
    List<Double> rlist = new ArrayList<>();
    List<Double> flist = new ArrayList<>();
    double fmax = 0.0;
    double smax = 0.0;
    double tmax = 0.0;

    for (double val : list) {
        if (val == d) continue;
        rlist.add(val);
    }

    Collections.sort(rlist, Collections.reverseOrder());
    IO.println();
    if (rlist.size() <= 3) {
        IO.print(rlist);
    } else {
        int count = 0;
        for (double num : rlist) {
            if (count >= 3) break;
            flist.add(num);
            count++;
        }
        IO.print(flist);
    }
}