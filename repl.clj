(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.browser)

(cljs.build.api/build "src"
  {:main 'cljs-project.core
   :output-to "out/main.js"
   :output-dir "out"
   :verbose true})

(cljs.repl/repl (cljs.repl.browser/repl-env)
  :watch "src"
  :output-dir "out")