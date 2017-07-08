(defproject kubernetes-201707-api "0.3.2-SNAPSHOT"
  :description "Kubernetes Client API Library - a fork fron yanatan16/clj-kubernetes-api with v1 swagger updated"
  :url "https://github.com/pfeodrippe/clj-kubernetes-api"
  :license {:name "MIT"
            :url "https://github.com/pfeodrippe/clj-kubernetes-api/blob/master/LICENSE"}

  :plugins [[s3-wagon-private "1.3.0"]]

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/core.async "0.2.374"]
                 [org.clojure/data.json "0.2.6"]
                 [http-kit "2.1.18"]]

  :repositories  [["central"  {:url "http://repo1.maven.org/maven2/" :snapshots false}]
                  ["clojars"  {:url "https://clojars.org/repo/"}]
                  ["nu-maven" {:url "s3p://nu-maven/releases/"}]]

  :codox {:namespaces [#"kubernetes\.api\.v\d.*"]}

  :profiles {:dev {:plugins [[lein-codox "0.9.0"]]}})
