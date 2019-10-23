package org.nuisto

import org.nuisto.model.OptionsModel

class SpyMuleLint extends MuleLint {
  OptionsModel modelUsed


  // Rodolphe Lezennec: this method is in conflict with the void runWithModel method in MuleLint 
  // Oct 22, 2019
  /*
  int runWithModel(OptionsModel model) {
    this.modelUsed = model
  }
  */
}
