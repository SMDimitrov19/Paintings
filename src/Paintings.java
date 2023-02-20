import java.util.ArrayList;
import java.util.List;

public class Paintings {
    private List<Painting> paintings;

    public Paintings() {
        this.paintings = new ArrayList<>();
    }

    public List<Painting> getPaintings() {
        return paintings;
    }

    public void setPaintings(List<Painting> paintings) {
        this.paintings = paintings;
    }

    public void addPainting(Painting painting) throws Exception {
        for (Painting p : paintings) {
            if (p.getUniqueNumber() == painting.getUniqueNumber()) {
                throw new Exception("Painting with the same unique number already exists.");
            }
        }
        paintings.add(painting);
    }

    public boolean deletePainting(int uniqueNumber) {
        for (Painting p : paintings) {
            if (p.getUniqueNumber() == uniqueNumber) {
                paintings.remove(p);
                break;
            }
        }
        return true;
    }
    public void printPaintingsByAuthor(String authorName) {
        if (authorName.isEmpty()) {
            for (Painting p : paintings) {
                System.out.println(p.toString());
            }
        } else {
            for (Painting p : paintings) {
                if (p.getAuthor().equals(authorName)) {
                    System.out.println(p.toString());
                }
            }
        }
    }

}