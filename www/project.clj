(defproject app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48"]
                 [im.chit/gyr "0.3.1"]
                 ]

  :plugins [[lein-cljsbuild "1.1.0"]]
  :cljsbuild {:builds
              {:min {:source-paths ["src"]
                     :compiler {:output-to "out/main.js"
                                :optimizations :advanced}}}}
  )
