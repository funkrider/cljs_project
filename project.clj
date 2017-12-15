(defproject cljs_project "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.671"]]
  :plugins [[cider/cider-nrepl "0.15.1"]]
  :profiles {:dev {:dependencies [[com.cemerick/piggieback "0.2.2"]
                                  [org.clojure/tools.nrepl "0.2.10"]]
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target")
