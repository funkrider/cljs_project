(ns cljs-project.core
  (:require [weasel.repl :as repl]))

(when-not (repl/alive?) (repl/connect "ws://localhost:9001"))

(enable-console-print!)
(println "Hello world!")