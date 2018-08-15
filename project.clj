(defproject tasks-mvp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-midje "3.2.1"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/java.jdbc "0.3.5"]
                 [org.xerial/sqlite-jdbc "3.7.2"]
                 [org.clojure/tools.cli "0.3.7"]
                 [midje "1.9.2"]]
  :main ^:skip-aot tasks-mvp.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
