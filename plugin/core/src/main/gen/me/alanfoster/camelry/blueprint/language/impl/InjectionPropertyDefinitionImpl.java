// This is a generated file. Not intended for manual editing.
package me.alanfoster.camelry.blueprint.language.impl;

import me.alanfoster.camelry.blueprint.language.psi.InjectionPropertyDefinition;
import me.alanfoster.camelry.blueprint.language.psi.InjectionPsiImplUtil;
import me.alanfoster.camelry.blueprint.language.psi.InjectionVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import me.alanfoster.camelry.blueprint.language.psi.impl.BlueprintInjectionPropertyDefinitionImpl;
import me.alanfoster.camelry.blueprint.dom.model.Property;

public class InjectionPropertyDefinitionImpl extends BlueprintInjectionPropertyDefinitionImpl implements InjectionPropertyDefinition {

  public InjectionPropertyDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof InjectionVisitor) ((InjectionVisitor)visitor).visitPropertyDefinition(this);
    else super.accept(visitor);
  }

  public String getName() {
    return InjectionPsiImplUtil.getName(this);
  }

  public PsiElement getNameIdentifier() {
    return InjectionPsiImplUtil.getNameIdentifier(this);
  }

  public PsiElement setName(String newName) {
    return InjectionPsiImplUtil.setName(this, newName);
  }

  public String getPropertyName() {
    return InjectionPsiImplUtil.getPropertyName(this);
  }

  public PsiElement getPropertyElement() {
    return InjectionPsiImplUtil.getPropertyElement(this);
  }

  @Nullable
  public Property getReferencedProperty() {
    return InjectionPsiImplUtil.getReferencedProperty(this);
  }

}
