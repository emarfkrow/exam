/**
 * ユーザマスタグリッド定義
 */

let MhrUserGridColumns = [
    Column.comma('USER_ID', Messages['MhrUserGrid.userId'], 80, 'primaryKey numbering', null),
    Column.text('USER_SEI', Messages['MhrUserGrid.userSei'], 300, '', null),
    Column.text('USER_MEI', Messages['MhrUserGrid.userMei'], 300, '', null),
    Column.text('EMAIL', Messages['MhrUserGrid.email'], 300, '', null),
    Column.text('PASSWORD', Messages['MhrUserGrid.password'], 300, '', null),
    Column.date('KAISHI_BI', Messages['MhrUserGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrUserGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.cell('INSERT_DT', Messages['MhrUserGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MhrUserGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MhrUserGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MhrUserGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MhrUserGrid.deleteF'], 30, ''),
];
