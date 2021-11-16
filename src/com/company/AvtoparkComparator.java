package com.company;
import java.util.Comparator;
import com.company.Avtopark;
public class AvtoparkComparator implements Comparator<Avtopark> {
    private AvtoparkEnum sortingIndex;
    public AvtoparkComparator(AvtoparkEnum sortingIndex ){
        setSortingIndex(sortingIndex);
    }
    public final void setSortingIndex(AvtoparkEnum sortingIndex){
        if (sortingIndex == null){
            throw  new IllegalArgumentException();
        }
        this.sortingIndex= sortingIndex;
    }

    public AvtoparkEnum getSortingIndex() {
        return sortingIndex;
    }

    @Override
    public int compare(Avtopark one,Avtopark two) {
        switch (sortingIndex) {
            case MASHRYT:
                return one.getMashryt() - two.getMashryt();
            case PASSAGIR:
                return one.getPassagir() - two.getPassagir();
            case AVTOPARK:
                return one.getAvtpark().compareTo(two.getAvtpark());
            default:
                throw new EnumConstantNotPresentException(AvtoparkEnum.class,
                        sortingIndex.name());

        }
    }
}


