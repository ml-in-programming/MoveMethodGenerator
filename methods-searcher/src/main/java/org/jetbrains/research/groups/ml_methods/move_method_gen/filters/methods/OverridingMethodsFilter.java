package org.jetbrains.research.groups.ml_methods.move_method_gen.filters.methods;

import com.intellij.codeInsight.AnnotationUtil;
import com.intellij.psi.PsiMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.research.groups.ml_methods.move_method_gen.filters.Filter;

import java.util.function.Predicate;

public class OverridingMethodsFilter implements Filter<PsiMethod> {
    @Override
    public boolean test(final @NotNull PsiMethod psiMethod) {
        return AnnotationUtil.findAnnotation(psiMethod, "Override") == null &&
                psiMethod.findSuperMethods().length == 0;
    }
}
