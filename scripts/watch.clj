(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cljs_first_project.core
   :output-to "out/cljs_first_project.js"
   :output-dir "out"})
