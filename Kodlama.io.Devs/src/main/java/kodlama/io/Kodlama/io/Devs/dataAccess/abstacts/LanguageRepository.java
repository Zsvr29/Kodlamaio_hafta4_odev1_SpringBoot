package kodlama.io.Kodlama.io.Devs.dataAccess.abstacts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public interface LanguageRepository {
	List<Language> getAll();  // Dilleri listeleme 
	
	Language getId(int id);
	void add(Language language);
	void update(Language language);
	void delete(int id);
	

}
