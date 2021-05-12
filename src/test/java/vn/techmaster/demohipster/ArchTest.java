package vn.techmaster.demohipster;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("vn.techmaster.demohipster");

        noClasses()
            .that()
            .resideInAnyPackage("vn.techmaster.demohipster.service..")
            .or()
            .resideInAnyPackage("vn.techmaster.demohipster.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..vn.techmaster.demohipster.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
