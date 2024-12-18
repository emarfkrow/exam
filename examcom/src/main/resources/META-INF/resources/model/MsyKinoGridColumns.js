/**
 * 機能マスタグリッド定義
 */

let MsyKinoGridColumns = [
    Column.text('KINO_NM', Messages['MsyKinoGrid.kinoNm'], 240, 'primaryKey', null),
    Column.text('KINO_MEI', Messages['MsyKinoGrid.kinoMei'], 300, '', null),
    Column.date('KAISHI_BI', Messages['MsyKinoGrid.kaishiBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.date('SHURYO_BI', Messages['MsyKinoGrid.shuryoBi'], 80, '', Slick.Formatters.Extends.Date),
    Column.cell('INSERT_TS', Messages['MsyKinoGrid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['MsyKinoGrid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['MsyKinoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['MsyKinoGrid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MsyKinoGrid.deleteF'], 30, ''),
];
