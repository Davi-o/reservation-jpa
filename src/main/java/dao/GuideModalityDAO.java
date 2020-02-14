package dao;

import domain.GuideModality;
import domain.Modality;

public class GuideModalityDAO extends DAO<GuideModality> {

    @Override
    protected String getSqlString() {
        return "select m from GuideModality m";
    }

    @Override
    protected Class getClassName() {
        return GuideModality.class;
    }
}
