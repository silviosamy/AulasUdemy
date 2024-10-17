package TreinoMedia;

import java.util.ArrayList;
import java.util.List;

public class MediaAlunos {
    public static void main(String[] args) {

        List<Aluno> listNotas = new ArrayList<>();
        listNotas.add(new Aluno("Silvio", 8.5, 5.6, 7.9, 9.3, false));
        listNotas.add(new Aluno("Henrique", 6.5, 9.4, 7.0, 9.9, true));
        UtilClass utilClass = new UtilClass();

        for (Aluno aluno : listNotas) {
            if (utilClass.getMediaNota() >= 7) {
                aluno.setStatus("Aprovado");
            } else {
                aluno.setStatus("Reprovado");
            }listNotas.l
        }


    }
}