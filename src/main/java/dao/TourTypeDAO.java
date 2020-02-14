package dao;

import domain.TourType;

public class TourTypeDAO extends DAO<TourType> {

    @Override
    protected String getSqlString() {
        return "select t from TourType t";
    }
    
    @Override
    protected Class getClassName() {
        return TourType.class;
    }
}