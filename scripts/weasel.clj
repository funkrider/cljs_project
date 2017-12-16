;; use in the repl - to connect using weasel and piggieback.
(require 'cljs.build.api)
(cljs.build.api/build "src"
  {:main 'cljs-project.core
   :output-to "out/main.js"
   :output-dir "out"
   :verbose true})
(cemerick.piggieback/cljs-repl (cljs.repl.browser/repl-env))
(require 'cljs.repl)
(require 'cljs.repl.browser)
(cemerick.piggieback/cljs-repl (cljs.repl.browser/repl-env))
(js/alert "hiya!")
(require
  '[cljs.build.api :as b]
  '[cljs.repl :as repl]
  '[cljs.repl.browser :as browser])
(b/build "src"
  {:main 'cljs_project.core
   :output-to "out/cljs_project.js"
   :output-dir "out"
   :verbose true})
(require 'weasel.repl.websocket)
(cemerick.piggieback/cljs-repl (weasel.repl.websocket/repl-env :ip "0.0.0.0" :port 9001))
(js/alert "hiya!")