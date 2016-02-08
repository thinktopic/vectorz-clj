;; This file is proveded as a convenience for Leiningen users
;;
;; The pom.xml is used for official builds, and should be considered the
;; definitive source for build configuration.
;;
;; If you are having trouble building, please check the pom.xml for latest dependency versions

(defproject net.mikera/vectorz-clj "0.43.1-SNAPSHOT"
  :description "Fast vector library for Clojure, building on Vectorz and using core.matrix"
  :url "https://github.com/mikera/vectorz-clj"
  :license {:name "GNU Lesser General Public License (LGPL)"
            :url "http://www.gnu.org/licenses/lgpl.html"}
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java"]
  :test-paths ["src/test/clojure"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [net.mikera/core.matrix "0.50.0-SNAPSHOT"]
                 [net.mikera/vectorz "0.59.0"]]

  :profiles {:dev {:dependencies [[criterium/criterium "0.4.3"]
                                  [org.clojure/tools.analyzer "0.6.7"]
                                  [org.clojure/test.check "0.9.0"]
                                  [net.mikera/cljunit "0.3.1"]
                                  [net.mikera/clojure-utils "0.6.2"]]
                   :java-source-paths ["src/test/java"]}}

  :repositories [["clojars.org" {:url "https://clojars.org/repo"
                                 :name "Clojars repository"}]])
