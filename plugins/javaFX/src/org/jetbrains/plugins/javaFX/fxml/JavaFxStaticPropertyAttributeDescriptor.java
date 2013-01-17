/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.plugins.javaFX.fxml;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMethod;

/**
 * User: anna
 * Date: 1/10/13
 */
public class JavaFxStaticPropertyAttributeDescriptor extends JavaFxPropertyAttributeDescriptor {
  private final PsiMethod mySetter;
  
  public JavaFxStaticPropertyAttributeDescriptor(PsiMethod setter, String name) {
    super(name, setter.getContainingClass());
    mySetter = setter;
  }

  @Override
  public PsiElement getDeclaration() {
    return mySetter;
  }
}
