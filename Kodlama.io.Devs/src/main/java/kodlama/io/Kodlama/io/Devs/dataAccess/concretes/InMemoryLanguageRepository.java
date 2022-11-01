package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstacts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
//(veri tabanına gıtmıyecez bellleten calısacaz)
	
	List<Language> languages;
	
	public InMemoryLanguageRepository() {
	languages=new ArrayList<Language>();
	languages.add(new Language(1,"C#"));
	languages.add(new Language(2,"Java"));
	languages.add(new Language(3,"Python"));
	
	
	
}

	@Override
	public List<Language> getAll() {
		
		return languages; // tumunu lıstelemek ıstıyorum.
	}

	@Override
	public Language getId(int id) {
		for (Language language : languages) {
			if (language.getId()==id) {
				return language;
			}
			
		}
		return null;
		
		 
	}

	@Override
	public void add(Language language) {
	languages.add(language);
		
	}

	@Override
	public void update(Language language) {
		for (Language languagee : languages) {
			
			if(language.getId()==languagee.getId()) {
				languagee.setName(language.getName());
			}
		}
		
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
		
	}

}
