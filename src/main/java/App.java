import dao.GuideModalityDAO;
import dao.ModalityDAO;
import dao.TourGuideDAO;
import domain.GuideModality;
import domain.Modality;
import domain.TourGuide;

public class App {

    public static void main(String[] args) {
        ModalityDAO modalityDAO = new ModalityDAO();
        Modality modality = new Modality("Caminhada");
        modalityDAO.save(modality);

        TourGuideDAO tourGuideDAO = new TourGuideDAO();
        TourGuide tourGuideDA = new TourGuide("Davi Alves");
        tourGuideDAO.save(tourGuideDA);
        TourGuide tourGuideFP = new TourGuide("Fábio Pfeiff");
        tourGuideDAO.save(tourGuideFP);
        
        GuideModalityDAO gmDAO = new GuideModalityDAO();
        GuideModality gmDA = new GuideModality(tourGuideDA,modality);
        gmDAO.save(gmDA);
        GuideModality gmFP = new GuideModality(tourGuideFP,modality);
        gmDAO.save(gmFP);
        
//        TourTypeDAO tourTypeDAO = new TourTypeDAO();
//        TourType tourType = new TourType("Privativo");
//        tourTypeDAO.save(tourType);
//        
        
//        List<Modality> modalities = modalityDAO.listarTodos();
//        for (Modality domain : modalities) {
//            System.out.println(domain.getId() + " / " + domain.getNome());
//        }

    }

}
