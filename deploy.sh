# Map branch to repo and set the correct domain
if [ $TRAVIS_BRANCH = "master" ]
then
  GH_REF="github.com/offcourse/offcourse-info.git"
  echo user-staging.offcourse.io > build/CNAME
elif [ $TRAVIS_BRANCH = "production" ]
then
  GH_REF="github.com/offcourse/offcourse-info-production.git"
  echo offcourse.io > build/CNAME
fi

# Make sure GH doesn't Jekyll build
cp .nojekyll build/.nojekyll

# Deploy
cd build
git init
git config user.name "Zaturrby"
git config user.email "rjkorteschiel@gmail.com"
git add -A
git commit -m "deploy"
git push -f --quiet "https://${GH_TOKEN}@${GH_REF}" master:gh-pages > /dev/null 2>&1
