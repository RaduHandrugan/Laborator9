

import com.example.masini.model.Masina;
import com.example.masini.repository.MasinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasinaService
{

    @Autowired
    private MasinaRepository masinaRepository;

    public void adaugaMasina(Masina masina)
    {
        masinaRepository.save(masina);
    }

    public void stergeMasina(String numarInmatriculare)
    {
        masinaRepository.deleteById(numarInmatriculare);
    }

    public Masina cautaMasina(String numarInmatriculare)
    {
        return masinaRepository.findByNumarInmatriculare(numarInmatriculare);
    }

    public Iterable<Masina> toateMasinile()
    {
        return masinaRepository.findAll();
    }

    public long numarMasiniMarca(String marca)
    {
        return masinaRepository.countByMarca(marca);
    }

    public Iterable<Masina> masiniSub100000Km()
    {
        return masinaRepository.findByKilometriLessThan(100000);
    }

    public Iterable<Masina> masiniMaiNoiDe5Ani()
    {
        return masinaRepository.findByAnFabricatieGreaterThan(2018);
    }
}
