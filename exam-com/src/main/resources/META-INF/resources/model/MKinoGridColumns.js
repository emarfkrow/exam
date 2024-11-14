/**
 * 機能マスタグリッド定義
 */

let MKinoGridColumns = [
    Column.text('KINO_NM', Messages['MKinoGrid.kinoNm'], 300, 'primaryKey', null),
    Column.text('KINO_MEI', Messages['MKinoGrid.kinoMei'], 300, '', null),
    Column.date('KAISHI_BI', Messages['MKinoGrid.kaishiBi'], 150, '', Slick.Formatters.Extends.DateTime),
    Column.date('SHURYO_BI', Messages['MKinoGrid.shuryoBi'], 150, '', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_DT', Messages['MKinoGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['MKinoGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['MKinoGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['MKinoGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['MKinoGrid.deleteF'], 30, ''),
];
