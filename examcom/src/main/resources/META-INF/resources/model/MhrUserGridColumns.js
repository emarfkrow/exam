/**
 * ユーザマスタグリッド定義
 */

let MhrUserGridColumns = [
    Column.comma('USER_ID', Messages['MhrUserGrid.userId'], 80, 'primaryKey numbering', null),
    Column.text('USER_SEI', Messages['MhrUserGrid.userSei'], 300, 'notblank', null),
    Column.text('USER_MEI', Messages['MhrUserGrid.userMei'], 300, 'notblank', null),
    Column.text('EMAIL', Messages['MhrUserGrid.email'], 300, 'notblank', null),
    Column.text('PASSWORD', Messages['MhrUserGrid.password'], 300, 'notblank', null),
    Column.date('KAISHI_BI', Messages['MhrUserGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MhrUserGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.cell('INSERT_TS', Messages['MhrUserGrid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['MhrUserGrid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['MhrUserGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['MhrUserGrid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MhrUserGrid.deleteF'], 30, ''),
];
