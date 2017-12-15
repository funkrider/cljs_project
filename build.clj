(require 'cljs.build.api)
(cljs.build.api/build "src" {:main 'cljs-project.core
                             :output-to "out/main.js"})