package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstacts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	
	public LanguageManager(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		//iş kuralları
		
		return languageRepository.getAll();
	}

	@Override
	public Language getId(int id) {
		
	return languageRepository.getId(id);	
	
	}

	@Override
	public void add(Language language) throws Exception {
		List<Language> languages=languageRepository.getAll();
		for (Language language2 : languages) {
			if(language2.getName().equals(" ") || language2.getId()==language2.getId()) {
				throw new Exception("İsimler tekrar edemez veya boş girilemez");
			}
			
		}
		
		languageRepository.add(language);
	
	}

	@Override
	public void update(Language language) {
		
		languageRepository.update(language);
		
	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
		
	}

}
