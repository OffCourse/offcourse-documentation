(set-env!
 :source-paths    #{"source/clj-css"}
 :dependencies '[[org.martinklepsch/boot-garden "1.3.0-0"]
                 [prismatic/plumbing          "0.5.2"]])

(require
 '[org.martinklepsch.boot-garden :refer [garden]])

(deftask css []
  (set-env! 
    :source-paths #(conj % "source-cljcss/"))
  (task-options! garden {:styles-var   'offcourse.styles.index/base
                         :vendors ["webkit" "moz"]
                         :auto-prefix #{:position :user-select :column-count :column-gap :filter}
                         :output-to    "main.css"
                         :pretty-print true}
                 target {:dir #{".build-boot/stylesheets/"}})
  (println "Task: CSS")
  (comp (garden)
        (target)))

(deftask dev []
  (println "External pipeline: Boot \n\n")
  (println "Task: Development (dev)")
  (comp (watch)
        (css)))