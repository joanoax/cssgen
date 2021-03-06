(defproject cssgen "0.2.6"
  :description "Generate CSS from clojure code. Like an embedded sass."
  :url "http://github.com/paraseba/cssgen"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/algo.generic "0.1.0"]]
  :dev-dependencies [[lein-multi "1.0.0"]]
  :multi-deps {"1.5" [[org.clojure/clojure "1.5.1"]
                      [org.clojure/algo.generic "0.1.0"]]
               "1.4" [[org.clojure/clojure "1.4.0"]
                      [org.clojure/algo.generic "0.1.0"]]
               "1.3" [[org.clojure/clojure "1.3.0"]
                      [org.clojure/algo.generic "0.1.0"]]})

