import java.util.Comparator;

public class ageComparator implements Comparator<Employee> {


    private SortType sortType;

    public ageComparator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {

        return sortType == SortType.Ascending ? Double.compare(o1.calculateAge(), o2.calculateAge()) :
                Double.compare(o2.calculateAge(), o1.calculateAge());
    }
}