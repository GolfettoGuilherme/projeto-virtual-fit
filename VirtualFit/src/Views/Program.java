package Views;

import DTO.*;
import DAL.*;

public class Program {
    
    public static void main (String[] args){        
        TbExercicios dto = new TbExercicios();
        dto.setIdAluno(2);
        dto.setNome("Supino Reto");
        dto.setNumRepeticao(10);
        dto.setNumSerie(3);
        System.out.println(new tbExerciciosDAL().salvar(dto));
    }
    
}
