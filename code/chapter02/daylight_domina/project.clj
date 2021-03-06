(defproject daylight_domina "0.1.0-SNAPSHOT"
  :description "Find hours of daylight using Domina"
  :url "https://github.com/jdeisenberg/etudes-for-clojurescript"
  :dependencies [[org.clojure/clojure "1.7.0-beta2"]
                 [org.clojure/clojurescript "0.0-3269"]
                 [domina "1.0.3"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :node-dependencies [[source-map-support "0.2.8"]]
  :plugins [[lein-npm "0.4.0"]]
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release" "target" ".repl-0.0-3269"]
  :target-path "target")
