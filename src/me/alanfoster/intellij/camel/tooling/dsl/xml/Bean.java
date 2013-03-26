package me.alanfoster.intellij.camel.tooling.dsl.xml;

import com.intellij.psi.PsiClass;
import com.intellij.util.xml.*;
import org.jetbrains.annotations.NotNull;

/**
 * @author Alan Foster
 * @version 1.0.0-SNAPSHOT
 */
public interface Bean extends DomElement {
    @NameValue
    @Attribute("id")
    @NotNull
    @Required
    GenericAttributeValue<String> getId();

    @Attribute("class")
    @NotNull
    @Required
    GenericAttributeValue<PsiClass> getClassAttribute();
}
