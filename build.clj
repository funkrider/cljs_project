(require 'cljs.build.api)
(cljs.build.api/watch "src" {:main 'cljs-project.core
                             :output-to "out/main.js"})