package org.bcaring.intellj.vue;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.psi.PsiFile;
import org.bcaring.intellj.vue.psi.VueFile;
import org.jetbrains.annotations.NotNull;

public class VueStructureViewModel extends StructureViewModelBase implements
        StructureViewModel.ElementInfoProvider {
    public VueStructureViewModel(PsiFile psiFile) {
        super(psiFile, new VueStructureViewElement(psiFile));
    }

    @NotNull
    public Sorter[] getSorters() {
        return new Sorter[] {Sorter.ALPHA_SORTER};
    }


    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        return false;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return element instanceof VueFile;
    }
}