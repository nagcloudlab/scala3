
// package com.ibm.coolapp.model1:
//     class Foo:
//         private def privateMethod = ???
//         protected def protectedMethod = ???
//         private[model1] def privateModelMethod = ???


// import com.ibm.coolapp.model1.Foo
// class Bar:
//     val  f=Foo()
//     // f.privateMethod
//     // f.protectedMethod
//     // f.privateModelMethod        


package com.devdaily.coolapp.model:
    class Foo:
        // available under com.devdaily.coolapp.model
        private[model] def doUnderModel = ???
        // available under com.devdaily.coolapp
        private[coolapp] def doUnderCoolapp = ???
        // available under com.devdaily
        private[devdaily] def doUnderAcme = ???

import com.devdaily.coolapp.model.Foo       

package com.devdaily.coolapp.view:
    class Bar:
        val f = Foo()
        // f.doUnderModel // won’t compile
        f.doUnderCoolapp
        f.doUnderAcme

package com.devdaily.common:
    class Bar:
        val f = Foo()
        // f.doUnderModel //won’t compile
        // f.doUnderCoolapp // won’t compile
        f.doUnderAcme

// package com.devdaily.coolapp.model:
//     class Foo:
//         def doPublic = ???

// package some.other.scope:
//     class Bar:
//         val f = com.devdaily.coolapp.model.Foo()
//         f.doPublic        