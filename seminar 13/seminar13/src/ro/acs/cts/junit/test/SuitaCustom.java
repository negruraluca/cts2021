package ro.acs.cts.junit.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.acs.cts.categorii.TestGetPromovabilitate;
import ro.acs.cts.categorii.TestUrgente;
import ro.acs.cts.categorii.TesteNormale;

@RunWith(Categories.class) // cu SUite nu mai tine cont de exclude
@SuiteClasses({ TestGrupa.class, TestGrupaCuFixture.class, TestGrupaWithDummy.class, TestPromovabilitateWithFake.class,
		TestPromovabilitateWithStub.class })
@IncludeCategory({TestGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class,TestUrgente.class})
public class SuitaCustom {

}
