package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	
	//iş kurallarını yazacagım yapı.
	
	List<Language> getAll();
	Language getId(int id);
	void  add(Language language)throws Exception ;
	void update(Language language);
	void delete(int id);
	
	
	

}
