(require '[cljs.closure :as cljsc])

(println "Building ...")

(let [start (System/nanoTime)]
  (cljsc/build "src"
    {:main 'stats.core
     :output-to "out/stats.js"
     :output-dir "out"
     :optimizations :none
     :cache-analysis true
     :source-map true
     :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))


