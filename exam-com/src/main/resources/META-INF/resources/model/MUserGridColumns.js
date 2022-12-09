/**
 * ユーザマスタグリッド定義
 */

let MUserGridColumns = [
    Column.comma('USER_ID', Messages['MUserGrid.userId'], 150, 'primaryKey numbering', null),
    Column.text('USER_SEI', Messages['MUserGrid.userSei'], 300, '', null),
    Column.text('USER_MEI', Messages['MUserGrid.userMei'], 300, '', null),
    Column.text('EMAIL', Messages['MUserGrid.email'], 300, '', null),
    Column.text('PASSWORD', Messages['MUserGrid.password'], 300, '', null),
    Column.date('KAISHI_YMD', Messages['MUserGrid.kaishiYmd'], 150, '', null),
    Column.date('SHURYO_YMD', Messages['MUserGrid.shuryoYmd'], 150, '', null),
    Column.cell('INSERT_DT', Messages['MUserGrid.insertDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MUserGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MUserGrid.updateDt'], 300, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MUserGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MUserGrid.deleteF'], 30, ''),
];
